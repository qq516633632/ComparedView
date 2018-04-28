# ComparedView-投票对比控件
## 控件介绍
一个简洁的投票对比控件
## 效果图   

![](https://github.com/qq516633632/ComparedView/blob/master/dmo_img.gif)   

## 使用方法
## Gradle添加引用
```
compile 'com.zhuxiaoqing.comparedview:ComparedView:1.0.0'

```
## 在布局中加入

```xml
<com.zxq.comparedview.Paredview
      android:id="@+id/paredview_1"
      android:layout_width="match_parent"
      android:layout_height="wrap_content"
      zxq:lable_text_size="14sp"
      zxq:pared_hight="15dp"
      zxq:sussic_color="#B3936A"
      zxq:no_sussic_color="#35312E"
      zxq:lable_text_color="#D60031"

      android:layout_marginLeft="10dp"

      android:layout_marginRight="10dp"
      >
      
```

## 如果需要动态设置进度条内部值
```
        paredview.setMaxCount(maxCount);//设置最大值
        paredview.setSussicCount(sussic_count);//设置成功了多少（左边的占比）
        paredview.setBottomText(botmText);//设置底部文字
        paredview.setTop_lable_unit(top_lable_unit);//设置顶部显示单位
```   
更多配置请查看部分属性的set方法
## 刷新进度
```
void upSussicCount(double sussicCount)
```

## 自定义属性说明
```xml
<declare-styleable name="Paredview">
        <!--文本字体大小-->
        <attr name="lable_text_size" format="dimension|float" />
        <!-- 左边进度颜色-->
        <attr name="sussic_color" format="color" />
        <!-- 右边进度颜色-->
        <attr name="no_sussic_color" format="color" />
        <!-- 进度条高度 -->
        <attr name="pared_hight" format="dimension" />
        <!-- 文本颜色-->
        <attr name="lable_text_color" format="color"></attr>
        <!--最大值-->
        <attr name="max_count"  format="integer"/>
        <!--完成度-->
        <attr name="sussic_count" format="integer" />
        <!--底部文字-->
        <attr name="bottom_text" format="string"/>
        <!--顶部显示单位-->
        <attr name="unit_text" format="string" />
        <!--完成度文本颜色-->
        <attr name="sussic_lable_text_color"  format="color"/>

    </declare-styleable>
```  

垂直刻度尺和水平刻度尺通用




