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
public class User {
        private String name;
        private String gender;
        private List<Brick> dedicatedBricks;

        public User(String name, String gender) {
            this.name = name;
            this.gender = gender;
            this.dedicatedBricks = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public String getGender() {
            return gender;
        }

        public List<Brick> getDedicatedBricks() {
            return dedicatedBricks;
        }

        public void addDedicatedBrick(Brick brick) {
            this.dedicatedBricks.add(brick);
        }
    }