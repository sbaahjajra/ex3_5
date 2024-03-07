package ex_3_5.ex_3_5;

/**
 * Hello world!
 *
 */
public class App 
{
	public static boolean checkOut(double cart, int creditRating, Status status) {
        boolean approved = false;

        if (status == Status.GOLD) {
            if (cart < 3500.00) {
                approved = true;
            } else if (creditRating > 650) {
                approved = true;
            }
        } else if (status == Status.SILVER) {
            if (cart < 2500.00) {
                approved = true;
            } else if (creditRating > 750) {
                approved = true;
            }

            if (cart < 1500.00) {
                approved = true;
            } else if (creditRating > 800) {
                approved = true;
            }
        }

        return approved;
    }
}
