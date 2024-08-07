package demo.pattern.responsibilityChain.v2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 待检验产品
 * @author libiao
 */
@Data
@AllArgsConstructor
public class Product {

    /**
     * 产品长度
     */
    Integer length;

    /**
     * 产品宽度
     */
    Integer width;
}