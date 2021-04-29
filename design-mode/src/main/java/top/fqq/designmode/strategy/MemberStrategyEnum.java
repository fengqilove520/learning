package top.fqq.designmode.strategy;

/**
 * 描述
 *
 * @author fitch
 * @date 2021/4/16 9:27
 */
public enum MemberStrategyEnum {

    PrimaryMember("初级会员", 1,"primary"),
    IntermediateMember("中级会员", 3,"intermediate"),
    AdvancedMember("高级会员", 2,"advanced");

    private String name;
    private int type;
    private String enName;

    MemberStrategyEnum(String name, int type,String enName) {
        this.name = name;
        this.type = type;
        this.enName =enName;
    }

    public static String getName(int type) {
        for (MemberStrategyEnum c : MemberStrategyEnum.values()) {
            if (c.getType() == type) {
                return c.name;
            }
        }
        return null;
    }

    public static String getenName(int type) {
        for (MemberStrategyEnum c : MemberStrategyEnum.values()) {
            if (c.getType() == type) {
                return c.enName;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }
}
