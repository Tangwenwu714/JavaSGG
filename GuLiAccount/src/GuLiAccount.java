/**
 * ClassName: GuLiAccount
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Yubin-Liu
 * @Create 2023/11/20 15:14
 * @Version 1.0
 */
public class GuLiAccount {
    public static void main(String[] args) {
        boolean isFlag = true; //控制循环结束

        //初始金额
        int balance = 10000;

        String info = ""; //记录收支的信息

        while (isFlag){
            System.out.println("------------谷粒记账软件----------\n");
            System.out.println("            1 收支明细");
            System.out.println("            2 登记收入");
            System.out.println("            3 登记支出");
            System.out.println("            4 退   出\n");
            System.out.println("            请选择(1-4): ");

            char selection = Utility.readMenuSelection(); //获取用户选项

            switch (selection){
                case '1':
                    System.out.println("----------当前收支明细--------");
                    System.out.println("收支\t账户金额\t收支金融\t说明");
                    System.out.println(info);
                    break;
                case '2':
                    System.out.println("本次收入金融：");
                    int money1 = Utility.readNumber();

                    if (money1 > 0 ) {
                        balance += money1;
                    }

                    System.out.println("本次收入说明：");
                    String addDesc = Utility.readString();

                    info += "收入\t" + balance +"\t" + money1 +"\t" +addDesc+'\n';
                    System.out.println("---------登记完成------------");
                    break;
                case '3':
                    System.out.println("本次支出金额：");
                    int money2 = Utility.readNumber();

                    if (money2 > 0 && balance >= money2) {
                        balance -= money2;

                    }

                    System.out.println("本次支出说明：");
                    String minusDesc = Utility.readString();

                    info += "支出\t" + balance +"\t" + money2 +"\t" + minusDesc+'\n';
                    System.out.println("---------登记完成------------");
                    break;
                case '4':
                    System.out.println("\n确认是否支出(Y/N): ");
                    char isExit = Utility.readConfirmSelection();
                    if (isExit == 'Y'){
                        isFlag = false;
                    }
                    break;
            }



        }
    }
}
