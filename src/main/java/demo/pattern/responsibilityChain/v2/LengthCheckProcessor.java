package demo.pattern.responsibilityChain.v2;

/**
 * @author libiao
 */
public class LengthCheckProcessor implements Processor {

    @Override
    public boolean process(Product product, ProcessorChain chain) {
        Integer length = product.getLength();
        if (length < 100 && length > 50) {
            System.out.println("产品长度检验通过");
            return chain.process(product);
        }
        // 产品长度未检验通过
        System.out.println("产品长度未检验通过");
        return false;
    }
}