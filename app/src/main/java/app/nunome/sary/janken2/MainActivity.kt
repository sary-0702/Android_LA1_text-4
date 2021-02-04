package app.nunome.sary.janken2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var winnum:Int = 0
        var losenum:Int = 0

        gooButton.setOnClickListener {
            player.setImageResource(R.drawable.janken_gu)
            val number: Int  = Random.nextInt(3)

            when (number) {
                0 -> {
                    cpu.setImageResource(R.drawable.janken_gu)
                    result.text = "引き分けです"
                    result.setTextColor(Color.parseColor("#8a000000"))
                }
                1 -> {
                    cpu.setImageResource(R.drawable.janken_choki)
                    result.text = "あなたの勝ちです"
                    result.setTextColor(Color.rgb(255, 0, 0))
                    winnum = winnum + 1
                    winNumber.text = winnum.toString()
                }
                2 -> {
                    cpu.setImageResource(R.drawable.janken_pa)
                    result.text = "あなたの負けです"
                    result.setTextColor(Color.parseColor("#2196f3"))
                    losenum = losenum + 1
                    loseNumber.text = losenum.toString()
                }
            }
        }

        chokiButton.setOnClickListener {
            player.setImageResource(R.drawable.janken_choki)
            val number: Int  = Random.nextInt(3)

            when (number) {
                0 -> {
                    cpu.setImageResource(R.drawable.janken_gu)
                    result.text = "あなたの負けです"
                    result.setTextColor(Color.parseColor("#2196f3"))
                    losenum = losenum + 1
                    loseNumber.text = losenum.toString()
                }
                1 -> {
                    cpu.setImageResource(R.drawable.janken_choki)
                    result.text = "引き分けです"
                    result.setTextColor(Color.parseColor("#8a000000"))
                }
                2 -> {
                    cpu.setImageResource(R.drawable.janken_pa)
                    result.text = "あなたの勝ちです"
                    result.setTextColor(Color.rgb(255, 0, 0))
                    winnum = winnum + 1
                    winNumber.text = winnum.toString()
                }
            }
        }

        paaButton.setOnClickListener {
            player.setImageResource(R.drawable.janken_pa)
            val number: Int  = Random.nextInt(3)

            when (number) {
                0 -> {
                    cpu.setImageResource(R.drawable.janken_gu)
                    result.text = "あなたの勝ちです"
                    result.setTextColor(Color.rgb(255, 0, 0))
                    winnum = winnum + 1
                    winNumber.text = winnum.toString()
                }
                1 -> {
                    cpu.setImageResource(R.drawable.janken_choki)
                    result.text = "あなたの負けです"
                    result.setTextColor(Color.parseColor("#2196f3"))
                    losenum = losenum + 1
                    loseNumber.text = losenum.toString()
                }
                2 -> {
                    cpu.setImageResource(R.drawable.janken_pa)
                    result.text = "引き分けです"
                    result.setTextColor(Color.parseColor("#8a000000"))
                }
            }
        }
    }
}