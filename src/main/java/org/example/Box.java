package org.example;

public class Box {
    double width;
    double heigth;
    double length;

    public Box(Box box, Box box1) {
        this.width = box.width + box1.width;
        this.heigth = box.heigth + box.heigth;
        this.length = box.length + box1.length;
    }

   public Box sumBox  (Box box){

        return new Box(this.width + box.width, this.heigth + box.heigth, this.length + box.length);

   }

}
