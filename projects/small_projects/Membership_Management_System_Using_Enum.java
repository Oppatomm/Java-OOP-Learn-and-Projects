enum MembershipLevel {
    BRONZE ,
    SILVER , 
    GOLD ,
    PLATINUM 
}

class Member {
    private String name;
    private MembershipLevel membership;

    Member (String name , MembershipLevel membershipLevel) {
        this.name = name;
        this.membership = membershipLevel;
    }

    public void upgradeLevel() {

        if (this.membership == MembershipLevel.PLATINUM) {
            System.out.println(name + " is already at the top level.");
            return;
        }

        switch (this.membership) {
            case BRONZE :
                this.membership = MembershipLevel.SILVER;
                break;
            case SILVER :
                this.membership = MembershipLevel.GOLD;
                break;
            case GOLD :
                this.membership = MembershipLevel.PLATINUM;
                break;
            case PLATINUM :
                break;
        }
        System.out.println(name + " Upgrade to " + this.membership);
    }

    public void showInfo() {
        System.out.println(name + " : " + membership);
    }
}

public class Membership_Management_System_Using_Enum {
    public static void main(String[] args) {
        Member member1 = new Member ("Jane" , MembershipLevel.BRONZE);
        member1.showInfo();
        member1.upgradeLevel();

        member1.showInfo();
        member1.upgradeLevel();

        member1.showInfo();
        member1.upgradeLevel();

        member1.showInfo();
        member1.upgradeLevel();
    }
}
