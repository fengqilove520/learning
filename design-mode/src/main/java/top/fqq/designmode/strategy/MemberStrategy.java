package top.fqq.designmode.strategy;

/**
 * 描述 抽象折扣类
 *
 * @author fitch
 * @date 2021/4/16 9:09
 */
public interface MemberStrategy {
    /**
     * 计算图书的价格
     * @param booksPrice    图书的原价
     * @return    计算出打折后的价格
     */
    double calcPrice(double booksPrice);
}
