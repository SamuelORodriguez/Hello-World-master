package BattleShip;

import java.util.Random;

public class initShips {
    public static void initShips(int[][] shipmaker){
        Random random = new Random();
        
        for(int ship=0 ; ship < 3 ; ship++){
            shipmaker[ship][0]=random.nextInt(5);
            shipmaker[ship][1]=random.nextInt(5);
            
            //let's check if that shot was already tried 
            //if it was, just finish the do...while when a new pair was randomly selected
            for(int last=0 ; last < ship ; last++){
                if( (shipmaker[ship][0] == shipmaker[last][0])&&(shipmaker[ship][1] == shipmaker[last][1]) )
                    do{
                        shipmaker[ship][0]=random.nextInt(5);
                        shipmaker[ship][1]=random.nextInt(5);
                    }while( (shipmaker[ship][0] == shipmaker[last][0])&&(shipmaker[ship][1] == shipmaker[last][1]) );
            }
            
        }
    }
}
