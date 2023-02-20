class TelevisionMuteTest {

    public static void main(String[] args) {
        Television tv = new Television("Samsung", 32);

        System.out.println(tv); // toString() automatically called

        tv.mute();
        System.out.println(tv); // mute state

        tv.mute();
        System.out.println(tv); // unmute

        tv.mute();              // back to mute
        System.out.println(tv);

        tv.setVolume(50); // should automatically unmute, and now be volume 50
        System.out.println(tv); //
    }
}