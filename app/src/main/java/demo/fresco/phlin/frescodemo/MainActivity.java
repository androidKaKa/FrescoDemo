package demo.fresco.phlin.frescodemo;

import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeController;
import com.facebook.drawee.drawable.ProgressBarDrawable;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;


public class MainActivity extends ActionBarActivity {

    private SimpleDraweeView SDrawView=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fresco.initialize(MainActivity.this);
        setContentView(R.layout.activity_main);



        //DemoOneº”‘ÿÕº∆¨
//        SDrawView=(SimpleDraweeView)findViewById(R.id.my_image_view);
//        Uri uri = Uri.parse("https://www.baidu.com/img/bdlogo.png");
//        SDrawView.setImageURI(uri);

        //DemoTwo setImageProgress
        GenericDraweeHierarchyBuilder builderDemo=new GenericDraweeHierarchyBuilder(getResources());

        GenericDraweeHierarchy hierarchy = builderDemo
                .setFadeDuration(300)
                .setProgressBarImage(new ProgressBarDrawable())
                .build();

        SDrawView=(SimpleDraweeView)findViewById(R.id.my_image_view);
        SDrawView.setHierarchy(hierarchy);

        Uri uri = Uri.parse("http://img.whnews.cn/20150625/17/6778881988523642793.jpg");
        SDrawView.setImageURI(uri);


//        int width = 50, height = 50;
//        ImageRequest request = ImageRequestBuilder.newBuilderWithSource(uri)
//                .setResizeOptions(new ResizeOptions(width, height))
//                .setAutoRotateEnabled(true)
//                .build();
//        PipelineDraweeController controller = Fresco.newDraweeControllerBuilder()
//                .setOldController(mDraweeView.getController())
//                .setImageRequest(request)
//                .build();
//        SDrawView.setController(controller);


        //DemoThree
               // pd=(SimpleDraweeView)findViewById(R.id.my_image_view);
        //SDrawView.setHierarchy(hierarchy);

//        Uri uri = Uri.parse("http://img.whnews.cn/20150625/17/6778881988523642793.jpg");
//        SDrawView.setImageURuri);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
