package Constructor;
    class Player {
        private
        String name;
        int health;

        public Player() {
            name = "DEFAULT PLAYER";
            health = 100;
        }

        void set_health(int health) {
            this.health = health;
        }

        Player(String name, int health) {
            this.name = name;
            this.health = health;
        }

        String get_name() {
            return name;
        }

        int get_health() {
            return health;
        }

        void talk(String text) {
            System.out.println(name + " says " + text);
        }

        Boolean is_dead() {
            if (health == 0) {
                System.out.println(name + "'s health is " + health + " So Player is out ");
                return true;
            } else {
                System.out.println(name + "'s health is " + health + " So Player is still in the game ");
                return false;
            }
        }
    }
