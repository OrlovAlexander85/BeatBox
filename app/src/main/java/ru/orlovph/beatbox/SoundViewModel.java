package ru.orlovph.beatbox;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class SoundViewModel extends BaseObservable {
    private Sound mSound;
    private BeatBox mBeatBox;

    public SoundViewModel(BeatBox beatBox){
        mBeatBox = beatBox;
    }

    @Bindable
    public Sound getSound() {
        return mSound;
    }

    public String getTitle(){
        return mSound.getName();
    }

    public void setSound(Sound sound) {
        mSound = sound;

//      Notifies your binding class that all of the Bindable fields on
//      your objects have been updated
        notifyChange();
    }

    public void onButtonClicked() {
        mBeatBox.play(mSound);
    }
}
