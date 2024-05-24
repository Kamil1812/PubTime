package com.example.pubtime

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.ListView
import android.widget.TextView
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val football5 = listOf<String>("pub superBowl - mecze piłkarskie", "pub JackRussel - mecze piłkarskie")
        val football10 = listOf<String>("pub superBowl - mecze piłkarskie", "pub JackRussel - mecze piłkarskie", "pub footballGame - mecze piłkarskie")
        val football15 = listOf<String>("pub superBowl - mecze piłkarskie", "pub JackRussel - mecze piłkarskie", "pub footballGame - mecze piłkarskie", "pub ekstraGame - mecze piłkarskie", "pub Wilki - mecze piłkarskie")
        val football20 = listOf<String>("pub superBowl - mecze piłkarskie", "pub JackRussel - mecze piłkarskie", "pub footballGame - mecze piłkarskie", "pub ekstraGame - mecze piłkarskie", "pub Wilki - mecze piłkarskie", "pub dzikieKoty - mecze piłkarski")

        val tennis5 = listOf<String>("pub superRakieta - mecze tenisowe")
        val tennis10 = listOf<String>("pub superRakieta - mecze tenisowe", "pub beforek - mecze tenisowe")
        val tennis15 = listOf<String>("pub superRakieta - mecze tenisowe", "pub beforek - mecze tenisowe", "pub ekstraGame - mecze tenisowe")
        val tennis20 = listOf<String>("pub superRakieta - mecze tenisowe", "pub beforek - mecze tenisowe", "pub ekstraGame - mecze tenisowe", "pub czarnoNaBiałym - mecze tenisa")

        val slag5 = listOf<String>("Brak pubów żużlowych w podanej odległości :/")
        val slag10 = listOf<String>("pub Racing - zawody żużlowe")
        val slag15 = listOf<String>("pub Racing - zawody żużlowe", "pub ekstraGame - mecze żużlowe")
        val slag20 = listOf<String>("pub Racing - zawody żużlowe", "pub ekstraGame - mecze żużlowe")

        var textViewResults = findViewById<TextView>(R.id.textViewResults)

        var checkboxFootball = findViewById<CheckBox>(R.id.checkboxFootball)
        var checkboxTennis = findViewById<CheckBox>(R.id.checkboxTennis)
        var checkboxSlag = findViewById<CheckBox>(R.id.checkboxSlag)

        var seekBar = findViewById<SeekBar>(R.id.seekBarDistance)

        findViewById<Button>(R.id.btnFindPubs).setOnClickListener {
            textViewResults.text = ""

            if (seekBar.progress == 0) {
                textViewResults.text = "Brak pubów w podanej odległości!"
            } else {
                if (checkboxFootball.isChecked) {
                    if (checkboxTennis.isChecked) {
                        if (checkboxSlag.isChecked) {
                            if (seekBar.progress == 5) {
                                textViewResults.text = "$football5\n\n$tennis5\n\n$slag5"
                            } else if (seekBar.progress == 10) {
                                textViewResults.text = "$football10\n\n$tennis10\n\n$slag10"
                            } else if (seekBar.progress == 15) {
                                textViewResults.text = "$football15\n\n$tennis15\n\n$slag15"
                            } else if (seekBar.progress == 20) {
                                textViewResults.text = "$football20\n\n$tennis20\n\n$slag20"
                            } else {
                                textViewResults.text = "Brak pubów w podanej odległości"
                            }
                        } else {
                            if (seekBar.progress == 5) {
                                textViewResults.text = "$football5\n\n$tennis5"
                            } else if (seekBar.progress == 10) {
                                textViewResults.text = "$football10\n\n$tennis10"
                            } else if (seekBar.progress == 15) {
                                textViewResults.text = "$football15\n\n$tennis15"
                            } else if (seekBar.progress == 20) {
                                textViewResults.text = "$football20\n\n$tennis20"
                            } else {
                                textViewResults.text = "Brak pubów w podanej odległości"
                            }
                        }
                    } else {
                        if (checkboxSlag.isChecked) {
                            if (seekBar.progress == 5) {
                                textViewResults.text = "$football5\n\n$slag5"
                            } else if (seekBar.progress == 10) {
                                textViewResults.text = "$football5\n\n$slag10"
                            } else if (seekBar.progress == 15) {
                                textViewResults.text = "$football5\n\n$slag15"
                            } else if (seekBar.progress == 20) {
                                textViewResults.text = "$football5\n\n$slag20"
                            } else {
                                textViewResults.text = "Brak pubów w podanej odległości"
                            }
                        } else {
                            if (seekBar.progress == 5) {
                                textViewResults.text = "$football5"
                            } else if (seekBar.progress == 10) {
                                textViewResults.text = "$football10"
                            } else if (seekBar.progress == 15) {
                                textViewResults.text = "$football15"
                            } else if (seekBar.progress == 20) {
                                textViewResults.text = "$football20"
                            } else {
                                textViewResults.text = "Brak pubów w podanej odległości"
                            }
                        }
                    }
                } else if (checkboxTennis.isChecked) {
                    if (checkboxSlag.isChecked) {
                        if (seekBar.progress == 5) {
                            textViewResults.text = "$tennis5\n\n$slag5"
                        } else if (seekBar.progress == 10) {
                            textViewResults.text = "$tennis10\n\n$slag10"
                        } else if (seekBar.progress == 15) {
                            textViewResults.text = "$tennis15\n\n$slag15"
                        } else if (seekBar.progress == 20) {
                            textViewResults.text = "$tennis20\n\n$slag20"
                        } else {
                            textViewResults.text = "Brak pubów w podanej odległości"
                        }
                    } else {
                        if (seekBar.progress == 5) {
                            textViewResults.text = "$tennis5"
                        } else if (seekBar.progress == 10) {
                            textViewResults.text = "$tennis10"
                        } else if (seekBar.progress == 15) {
                            textViewResults.text = "$tennis15"
                        } else if (seekBar.progress == 20) {
                            textViewResults.text = "$tennis20"
                        } else {
                            textViewResults.text = "Brak pubów w podanej odległości"
                        }
                    }
                } else if (checkboxSlag.isChecked) {
                    if (seekBar.progress == 5) {
                        textViewResults.text = "$slag5"
                    } else if (seekBar.progress == 10) {
                        textViewResults.text = "$slag10"
                    } else if (seekBar.progress == 15) {
                        textViewResults.text = "$slag15"
                    } else if (seekBar.progress == 20) {
                        textViewResults.text = "$slag20"
                    } else {
                        textViewResults.text = "Brak pubów w podanej odległości"
                    }
                }
            }
        }

        seekBar.setOnSeekBarChangeListener(object : OnSeekBarChangeListener {
            override fun onStopTrackingTouch(seekBar: SeekBar) {
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
            }

            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                findViewById<TextView>(R.id.textViewDistanceFromPub).text = progress.toString() + "km"
            }
        })
    }
}