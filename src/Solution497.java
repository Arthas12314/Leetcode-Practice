import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// TODO
public class Solution497 {
    private Random random;
    
    private List<Rectangle> rectangleList;
    
    class Rectangle {
        private int ai;
        
        private int bi;
        
        private int xi;
        
        private int yi;
        
        public Rectangle(int ai, int bi, int xi, int yi) {
            this.ai = ai;
            this.bi = bi;
            this.xi = xi;
            this.yi = yi;
        }
        
        public int getAi() {
            return ai;
        }
        
        public int getBi() {
            return bi;
        }
        
        public int getXi() {
            return xi;
        }
        
        public int getYi() {
            return yi;
        }
    }
    
    public Solution497(int[][] rects) {
        random = new Random();
        rectangleList = new ArrayList<>();
        for (int i = 0; i < rects.length; i++) {
            rectangleList.add(new Rectangle(rects[i][0], rects[i][1], rects[i][2], rects[i][3]));
        }
    }
    
    public int[] pick() {
        Rectangle rectangle = rectangleList.size() == 1 ? rectangleList.get(0)
            : rectangleList.get(random.nextInt(rectangleList.size() - 1));
        
        int x = random.nextInt(rectangle.xi - rectangle.ai) + rectangle.ai;
        int y = random.nextInt(rectangle.yi - rectangle.bi) + rectangle.bi;
        return new int[] {x, y};
    }
}
