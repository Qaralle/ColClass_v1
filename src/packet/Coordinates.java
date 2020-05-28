package packet;

import javafx.beans.property.*;

import java.io.Serializable;

/**
 * Класс, предоставляющий координаты для человека либо локации
 * @author Maxim Antonov and Andrey Lyubkin
 */
public class Coordinates implements Comparable<Coordinates>, Serializable {
    private Float x; //Значение поля должно быть больше -652, Поле не может быть null
    private Double y; //Поле не может быть null



    /**
     * @param _x координата X
     * @param _y координата Y
     */
    public Coordinates(Float _x,Double _y){
        this.x=_x;
        this.y=_y;
    }

    public Coordinates(){

    }

    public Float getX(){
        return x;
    }

    public FloatProperty getPropX(){
        FloatProperty propX = new SimpleFloatProperty();
        propX.setValue(x);
        return propX;
    }

    public Double getY(){
        return y;
    }

    public DoubleProperty getPropY(){
        DoubleProperty propY = new SimpleDoubleProperty();
        propY.setValue(y);
        return propY;
    }

    /**
     * Метод, реализующий сравнение с другими координатами
     * @param o объект класса packet.Coordinates
     * @return результат сравнения
     */
    @Override
    public int compareTo(Coordinates o) {
        int compRes=0;
        if (x-o.getX()>0){
            compRes=compRes+1;
        }
        else if (x-o.getX()<0){
            compRes=compRes-1;
        }
        if (y-o.getY()>0){
            compRes=compRes+1;
        }
        else if (y-o.getY()<0){
            compRes=compRes-1;
        }
        return compRes;
    }

    public void SetX(Float x_){
        this.x=x_;
    }

    public void SetY(Double y_){
        this.y=y_;
    }
}