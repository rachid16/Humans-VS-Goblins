package com.pyramid;

import java.util.ArrayList;
import java.util.List;


public class Land {

    List<Humans> humansList = new ArrayList<>();
    List<Goblins> goblinsList = new ArrayList<>();
    Players [] [] grid ;


    public Land(){

        grid = new Players[10][10];

        for(int i=0; i< 9; i++){
            humansList.add(new Humans("name"+(i+1)));
        }

        for(int i=0; i< 9; i++){
            goblinsList.add(new Goblins("name"+(i+1)));
        }

        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                grid[i][j] = null;
            }
        }

        for(int i=9; i<10; i++){
            for(int j=3; j<6; j++){
                grid[i][j] = humansList.get(j);
            }
        }
        for(int i=0; i<1; i++){
            for(int j=0; j<9; j++){
                grid[i][j] = goblinsList.get(j);
            }
        }
    }

    public void disply(){

        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                if(grid[i][j] == null || grid[i][j].isAlive() == false )
                    System.out.print("  ");
                else
                    System.out.print(grid[i][j].toString());

            }
            System.out.println();
        }

    }

    public void moveHumans(String str){
        if(str.equals("n")){
            for(int i=9; i<10; i++){
                for(int j=3; j<6; j++){
                    grid[i-8][j] = grid[i][j];
                }
            }
        }
    }


}
