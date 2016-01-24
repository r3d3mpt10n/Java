
        
package cointoss;

import static java.lang.Math.random;
import java.util.Random;

/**
 *
 * @author shep
 */
public class CoinToss {
    
    
    public String tossACoin() {
        Random rand = new Random();
        int toss = Math.abs(rand.nextInt()) % 2; 
        if (toss == 0) {
            return "HEADS";    
        } else {
            return "TAILS";
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        CoinToss game = new CoinToss();
        game.tossACoin();
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
    }
    
}
