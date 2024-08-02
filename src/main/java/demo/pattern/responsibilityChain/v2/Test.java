package demo.pattern.responsibilityChain.v2;

/**
 * 责任链模式
 *
 * @author libiao
 */
public class Test {

    public static void main(String[] args) {
        int[][] arrays = {{60, 60}, {40, 40}, {40, 60}, {60, 40}};
        for (int[] array : arrays) {
            ProcessorChain processorChain = new ProcessorChain();
            processorChain.addProcessor(new LengthCheckProcessor());
            processorChain.addProcessor(new WidthCheckProcessor());

            Product product = new Product(array[0], array[1]);
            boolean checkResult = processorChain.process(product);
            if (checkResult) {
                System.out.println("产品最终检验合格");
            } else {
                System.out.println("产品最终检验不合格");
            }
            System.out.println();
        }
    }
}