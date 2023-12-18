import javax.swing.JList.DropLocation;

public class ShortPath {
    public static float shortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            // north
            if (dir == 'n') {
                y = y + 1;
            } else if (dir == 's') {
                y = y - 1;
            } else if (dir == 'w') {
                x = x + 1;
            } else {
                x = x - 1;
            }
        }
        int x2 = x * x;
        int y2 = y * y;
        return (float) Math.sqrt(x2 + y2);
    }

    public static void main(String[] args) {
        System.out.println(shortestPath("newww"));
    }
}
