/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bytesteam2;

/**
 *
 * @author Student
 */
public class LAB1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle c = new Circle();
        RedShapeDecorator redCircle = new RedShapeDecorator(c);
        redCircle.draw();
        
        Rectingle r = new Rectingle();
        RedShapeDecorator redRectingle = new RedShapeDecorator(r);
        redRectingle.draw();
    }
    
}
