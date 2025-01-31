/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Day3Task1;

/**
 *
 * @author kanav
 */
 public class Brick {
        private int id;
        private User owner;
        private String caption;
        private String message;
        private boolean visible;
        private boolean flagged;

        public Brick(int id, User owner, String caption, String message) {
            this.id = id;
            this.owner = owner;
            this.caption = caption;
            this.message = message;
            this.visible = true;
            this.flagged = false;
        }

        public int getId() {
            return id;
        }

        public User getOwner() {
            return owner;
        }

        public String getCaption() {
            return caption;
        }

        public String getMessage() {
            return message;
        }

        public boolean isVisible() {
            return visible;
        }

        public boolean isFlagged() {
            return flagged;
        }

        public void setFlagged(boolean flagged) {
            this.flagged = flagged;
        }

//        public void animate() {
//          
//            System.out.println("Animating brick " + id + " for owner " + owner.getName());
//        }
    }
