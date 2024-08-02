package demo.pattern.responsibilityChain.v2;

/**
 * @author libiao
 */
public interface Processor {

    boolean process(Product product, ProcessorChain chain);
}