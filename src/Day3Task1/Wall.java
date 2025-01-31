/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Day3Task1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kanav
 */
public class Wall {
        private int id;
        private List<Brick> bricks;

        public Wall(int id) {
            this.id = id;
            this.bricks = new ArrayList<>();
        }

        public int getId() {
            return id;
        }

        public List<Brick> getBricks() {
            return bricks;
        }
/*
    MARK: addBrick
    DESC:  it helps us to write on brick caption and
            comment and saves owner name and  brick id fr later retrival
    PARAMS: 
        - User owner ,String Caption , String message , int brickid;
    OUTPUT: 
        - Brick
*/
        public Brick addBrick(User owner, String caption, String message, int brickId) {
            if (bricks.size() < 90) {
                Brick brick = new Brick(brickId, owner, caption, message);
                bricks.add(brick);
                return brick;
            }
            return null; // No more space in this wall
        }
    }