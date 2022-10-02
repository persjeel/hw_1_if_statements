import static java.sql.Types.NULL;

public class Main {
    private static boolean Num_3_Is_Last(int num) {
        String str_num = String.valueOf(num);
        int last_char_position = str_num.length() - 1;
        char last_char = str_num.charAt(last_char_position);
        return last_char == '3';
    }

    private static String Get_Grivna_In_ProperForm(int money_sum) {
        if (money_sum == 1) return "гривню";
        else if (money_sum < 5) return "гривні";
        else if (money_sum < 10) return "гривень";
        return null;
    }

    private static double Get_Discriminant(double leading_coeff, double second_coeff, double constant_term) {
        return Math.pow(second_coeff, 2) - 4 * leading_coeff * constant_term;
    }

    private static double[] Get_Square_Equation(double leading_coeff, double second_coeff, double constant_term) {
        double[] roots = new double[2];
        double discriminant = Get_Discriminant(leading_coeff, second_coeff, constant_term);
        if (discriminant < 0) return null;
        else {
            roots[0] = (-second_coeff + discriminant) / 2 * leading_coeff;
            roots[1] = (-second_coeff - discriminant) / 2 * leading_coeff;
            return roots;
        }
    }

    public static void main(String[] args) {
        //task 1
        int num = 453;
        if (Num_3_Is_Last(num)) System.out.println("Number " + num + " has 3 as last digit");
        //task 2
        int money_sum = 1;
        String grivna = Get_Grivna_In_ProperForm(money_sum);
        System.out.println("Сплати " + money_sum + " " + grivna);
        money_sum = 4;
        grivna = Get_Grivna_In_ProperForm(money_sum);
        System.out.println("Сплати " + money_sum + " " + grivna);

        money_sum = 8;
        grivna = Get_Grivna_In_ProperForm(money_sum);
        System.out.println("Сплати " + money_sum + " " + grivna);
        //task 3
        double lead_coeff = 1;
        double second_coeff = 2;
        double constant_term = -5;
        double[] roots = Get_Square_Equation(lead_coeff, second_coeff, constant_term);
        if (roots != null) {
            for (double i : roots) System.out.println(i);
        }
    }


}