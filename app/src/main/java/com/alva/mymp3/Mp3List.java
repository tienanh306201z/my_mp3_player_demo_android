package com.alva.mymp3;

public class Mp3List {
    private String name;
    private String singer;
    private int imageId;
    private int songId;

    public static final Mp3List[] mp3Lists = {
            new Mp3List("Europe Skies","Alexander Rybak", R.drawable.europe_skies, R.raw.europe_skies),
            new Mp3List("OAH","Alexander Rybak", R.drawable.oah, R.raw.oah),
            new Mp3List("Funny Little World","Alexander Rybak", R.drawable.funny_little_world, R.raw.funny_little_world),
            new Mp3List("Let Her Go","Passenger", R.drawable.let_her_go, R.raw.let_her_go),
            new Mp3List("Lovely","Billie Eilish ft. Khalid", R.drawable.lovely, R.raw.lovely),
            new Mp3List("Lonely","Justin Bieber", R.drawable.lonely, R.raw.lonely),
            new Mp3List("Marry You","Bruno Mars", R.drawable.marry_you, R.raw.marry_you),
            new Mp3List("You're Beautiful","James Brunt", R.drawable.you_re_beautiful, R.raw.you_re_beautiful),
            new Mp3List("Talking To The Moon","Bruno Mars", R.drawable.talking_to_the_moon, R.raw.talking_to_the_moon),
            new Mp3List("Fly Me To The Moon","Frank Sinatra", R.drawable.fly_me_to_the_moon, R.raw.fly_me_to_the_moon),
            new Mp3List("Memories","Maroon 5", R.drawable.memories, R.raw.memories),
    };

    public Mp3List(String name, String singer, int imageId, int songId){
        this.name = name;
        this.singer = singer;
        this.imageId = imageId;
        this.songId = songId;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }

    public int getSongId() {
        return songId;
    }

    @Override
    public String toString() {
        return this.name + " - " + this.singer;
    }
}
