package Exersise_3;

public class Rectange {
    public double width;
    public double height;
    public String color;
    public Rectange(){
        width = 1;
        height = 1;
    }
    public Rectange(double width, double height, String color){
        this.width = width;
        this.height = height;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public double findArea(){
        return this.height * this.width;
    }
    public double findPerimeter(){
        return (this.height + this.width) * 2;
    }
}
