package jp.stoic.adnroid.animationsample

import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fade.setOnClickListener {
            if (image.visibility == View.VISIBLE) {
                image.startAnimation(AnimationUtils.loadAnimation(this, R.anim.fadeout))
                image.visibility = View.GONE
            } else {
                image.startAnimation(AnimationUtils.loadAnimation(this, R.anim.fadein))
                image.visibility = View.VISIBLE
            }
        }

        slide.setOnClickListener {
            if (bar.visibility == View.VISIBLE) {
                bar.startAnimation(AnimationUtils.loadAnimation(this, R.anim.slideout))
                bar.visibility = View.GONE
            } else {
                bar.startAnimation(AnimationUtils.loadAnimation(this, R.anim.slidein))
                bar.visibility = View.VISIBLE
            }
        }

        change.setOnClickListener {
            image.setImageResource(R.drawable.twitter_red)
        }
    }
}
