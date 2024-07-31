package demo.pattern.bridge;

/**
 * @author libiao
 */
public abstract class Shape {

    //添加一个颜色的成员变量以调用ColorAPI 的方法来实现给不同的形状上色
    protected ColorApi colorApi;

    public void setDrawApi(ColorApi colorApi) {      //注入颜色成员变量
        this.colorApi = colorApi;
    }

    public abstract void draw();
}
