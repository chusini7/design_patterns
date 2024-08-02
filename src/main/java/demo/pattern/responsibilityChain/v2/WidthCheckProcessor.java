package demo.pattern.responsibilityChain.v2;

/**
 * @author libiao
 */
public class WidthCheckProcessor implements Processor {

    @Override
    public boolean process(Product product, ProcessorChain chain) {
        Integer width = product.getWidth();
        if (width < 100 && width > 50) {
            System.out.println("产品宽度检验通过");
            return chain.process(product);
        }
        // 产品宽度未检验通过
        System.out.println("产品宽度未检验通过");
        return false;
    }
}