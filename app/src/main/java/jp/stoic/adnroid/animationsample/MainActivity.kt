package jp.stoic.adnroid.animationsample

import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var fadeout = R.anim.fadeout_fillafter
    private var fadein = R.anim.fadein_fillafter
    private var slideout = R.anim.slideout_fillafter
    private var slidein = R.anim.slidein_fillafter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fade.setOnClickListener {
            if (image.visibility == View.VISIBLE) {
                image.startAnimation(AnimationUtils.loadAnimation(this, fadeout))
                image.visibility = View.GONE
            } else {
                image.startAnimation(AnimationUtils.loadAnimation(this, fadein))
                image.visibility = View.VISIBLE
            }
        }

        slide.setOnClickListener {
            if (bar.visibility == View.VISIBLE) {
                bar.startAnimation(AnimationUtils.loadAnimation(this, slideout))
                bar.visibility = View.GONE
            } else {
                bar.startAnimation(AnimationUtils.loadAnimation(this, slidein))
                bar.visibility = View.VISIBLE
            }
        }

        change.setOnClickListener {
            image.setImageResource(R.drawable.twitter_red)
        }

        visible.setOnClickListener {
            image.visibility = View.VISIBLE
            bar.visibility = View.VISIBLE
        }

        invisible.setOnClickListener {
            image.visibility = View.INVISIBLE
            bar.visibility = View.INVISIBLE
        }

        gone.setOnClickListener {
            image.visibility = View.GONE
            bar.visibility = View.GONE
        }

        anime_off.setOnClickListener {
            image.animation = null
        }

        fa_on.setOnClickListener {
            fadeout = R.anim.fadeout_fillafter
            fadein = R.anim.fadein_fillafter
            slideout = R.anim.slideout_fillafter
            slidein = R.anim.slidein_fillafter
        }

        fa_off.setOnClickListener {
            fadeout = R.anim.fadeout
            fadein = R.anim.fadein
            slideout = R.anim.slideout
            slidein = R.anim.slidein
        }
    }
}
