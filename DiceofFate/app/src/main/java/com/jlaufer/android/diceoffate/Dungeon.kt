package com.jlaufer.android.diceoffate

import androidx.annotation.StringRes

class Dungeon (val mainMonsterPool: MonsterPool, val secondaryMonsterPool: MonsterPool, val location: LocationPool, @StringRes var name: Int, var peril: Int) {

}