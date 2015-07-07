Demo of Fresco
==
1、Fresco 加载图片 
-

（1）在 build.gradle 中添加以下依赖：

     dependencies {
      compile 'com.facebook.fresco:fresco:0.5.0+'
    }

（2）在AndroidManifest.xml 中 添加Internet 权限

    <uses-permission android:name="android.permission.INTERNET"/>

（3）在应用调用 setContentView() 之前，初始化：

    Fresco.initialize(MainActivity.this);
    setContentView(R.layout.activity_main);

（4）在xml布局文件中，添加命名空间：

    <RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    xmlns:fresco="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent" android:paddingLeft="@dimen/activity_horizontal_margin"
    android:paddingRight="@dimen/activity_horizontal_margin"
    android:paddingTop="@dimen/activity_vertical_margin"
    android:paddingBottom="@dimen/activity_vertical_margin" tools:context=".MainActivity">
    
    
    
    <com.facebook.drawee.view.SimpleDraweeView
    android:id="@+id/my_image_view"
    android:layout_width="300dp"
    android:layout_height="400dp"
    fresco:roundedCornerRadius="30dp"
    fresco:actualImageScaleType="focusCrop"
    />
    </RelativeLayout>
（5）使用SimpleDraweeView:

    Fresco.initialize(MainActivity.this);
    setContentView(R.layout.activity_main);
    
    //DemoOne加载图片
    SDrawView=(SimpleDraweeView)findViewById(R.id.my_image_view);
    Uri uri = Uri.parse("https://www.baidu.com/img/bdlogo.png");
    SDrawView.setImageURI(uri);



2、
-