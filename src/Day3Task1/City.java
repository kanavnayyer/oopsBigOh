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
public class City {
        private String name;
        private List<Wall> walls;
        private int wallIdCounter;
        private int brickIdCounter;
        private List<User> users;

        public City(String name) {
            this.name = name;
            this.walls = new ArrayList<>();
            this.wallIdCounter = 1;
            this.brickIdCounter = 1;
            this.users = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public List<Wall> getWalls() {
            return walls;
        }

        public List<User> getUsers() {
            return users;
        }

        public Wall getWallById(int wallId) {
            for (Wall wall : walls) {
                if (wall.getId() == wallId) {
                    return wall;
                }
            }
            return null;
        }

        public User getUserByName(String name) {
            for (User user : users) {
                if (user.getName().equals(name)) {
                    return user;
                }
            }
            return null;
        }

        public void addUser(User user) {
            this.users.add(user);
        }

        /*
    MARK: dedicateBrick
    DESC:  user can dedicate a brick to ay user by writing  message and caption for them
    PARAMS: 
        -  User user, String Caption, String message
    OUTPUT: 
        -  brick
*/
        public Brick dedicateBrick(User user, String caption, String message) {
            if (walls.isEmpty() || walls.get(walls.size() - 1).getBricks().size() >= 90) {
                Wall newBrick = new Wall(wallIdCounter++);
                walls.add(newBrick);
            }
            Wall lastWall = walls.get(walls.size() - 1);
            return lastWall.addBrick(user, caption, message, brickIdCounter++);
        }

        // who received the max number of bricks)
        public User findHottestUser() {
            User hottestUser = null;
            int maxBricks = 0;

            for (User user : users) {
                int totalBricks = user.getDedicatedBricks().size();
                if (totalBricks > maxBricks) {
                    maxBricks = totalBricks;
                    hottestUser = user;
                }
            }
            return hottestUser;
        }

        // Find out the person who didn't receive any dedication
        public User findUserWithNoDedication() {
            for (User user : users) {
                if (user.getDedicatedBricks().isEmpty()) {
                    return user;
                }
            }
            return null; // If all users have received dedications
        }
    }
