package string;

/**
 * shortest
 */
public class shortest {

    public static void main(String args[]) {
        String path = "WNEENESENNN";

        int x = 0;
        int y = 0;

        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'E')
                x++;
            else if (path.charAt(i) == 'N')
                y++;
            else if (path.charAt(i) == 'W')
                x--;
            else if (path.charAt(i) == 's')
                y--;
        }

        float shortDistance = (float) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println("Short Distance : " + shortDistance);
    }

}