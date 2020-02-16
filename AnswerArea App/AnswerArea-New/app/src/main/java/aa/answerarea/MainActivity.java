
        package aa.answerarea;

        import android.content.Context;
        import android.content.DialogInterface;
        import android.content.Intent;
        import android.net.ConnectivityManager;
        import android.net.NetworkInfo;
        import android.os.Handler;
        import android.provider.ContactsContract;
        import android.support.v4.view.GravityCompat;
        import android.support.v4.widget.DrawerLayout;
        import android.support.v4.widget.SwipeRefreshLayout;
        import android.support.v7.app.ActionBar;
        import android.support.v7.app.ActionBarActivity;
        import android.os.Bundle;
        import android.support.v7.app.ActionBarDrawerToggle;
        import android.support.v7.app.AlertDialog;
        import android.support.v7.app.AppCompatActivity;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.view.Window;
        import android.webkit.WebSettings;
        import android.webkit.WebView;
        import android.webkit.WebViewClient;
        import android.widget.Toolbar;


        public class MainActivity extends AppCompatActivity {


            private DrawerLayout drawer;


    WebView myWebView;
    SwipeRefreshLayout swipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar - findViewById(R.id.toolbar)
        setSupportActionBar(toolbar);


        drawer = findViewById(R.id.drawer_layout);


        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        @Override
        public void onBackPressed() {
            if (drawer.isDrawerOpen(GravityCompat.START)) {
                drawer.closeDrawer(GravityCompat.START);
            } else {
                super.onBackPressed();
            }
        }


        swipe = (SwipeRefreshLayout) findViewById(R.id.swipe);
        swipe.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {

                LoadWeb();
            }
        });

        LoadWeb();


    }
        public void LoadWeb(){

            myWebView = (WebView) findViewById(R.id.webView);
            myWebView.getSettings().setJavaScriptEnabled(true);
            myWebView.getSettings().setAppCacheEnabled(true);
            myWebView.loadUrl("https://www.answerarea.com/");
            swipe.setRefreshing(false);
            myWebView.setWebViewClient(new WebViewClient(){

                public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {

                    myWebView.loadUrl("file:///android_asset/error.html");
                }

                public  void  onPageFinished(WebView view, String url){

                    //Hide the SwipeReefreshLayout

                    swipe.setRefreshing(false);
                }

            });
        }




    @Override
    public void onBackPressed(){

        if (myWebView.canGoBack()){
            myWebView.goBack();
        }else {
            finish();
        }
    }



}
