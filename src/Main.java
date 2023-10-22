interface MusicPlayer {
    void playMusic();
    void stopMusic();
}

class SamsungPhone {
    void startSamsungMusic() {
        System.out.println("Samsung music started to play");
    }
    void stopSamsungMusic() {
        System.out.println("Samsung music turned off");
    }
}

class SonyWalkman {
    void startSonyMusic() {
        System.out.println("Sony music started to play");
    }
    void stopSonyMusic() {
        System.out.println("Sony music turned off");
    }
}

class SamsungAdapter implements MusicPlayer {
    SamsungPhone samsungPhone;

    public SamsungAdapter(SamsungPhone samsungPhone) {
        this.samsungPhone = samsungPhone;
    }

    public void playMusic() {
        samsungPhone.startSamsungMusic();
    }

    public void stopMusic() {
        samsungPhone.stopSamsungMusic();
    }
}

class SonyAdapter implements MusicPlayer {
    SonyWalkman sonyWalkman;

    public SonyAdapter(SonyWalkman sonyWalkman) {
        this.sonyWalkman = sonyWalkman;
    }

    public void playMusic() {
        sonyWalkman.startSonyMusic();
    }

    public void stopMusic() {
        sonyWalkman.stopSonyMusic();
    }
}

public class Main {
    public static void main(String[] args) {
        MusicPlayer samsungMusicPlayer = new SamsungAdapter(new SamsungPhone());
        MusicPlayer sonyMusicPlayer = new SonyAdapter(new SonyWalkman());

        samsungMusicPlayer.playMusic();
        sonyMusicPlayer.stopMusic();
    }
}
