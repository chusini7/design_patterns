package demo.pattern.facade;

/**
 * 外观模式
 *
 * @author libiao
 */
public class Test {

   public static void main(String[] args) {
      ShapeMaker shapeMaker = new ShapeMaker();
      // 一键画画
      shapeMaker.draw();
   }
}