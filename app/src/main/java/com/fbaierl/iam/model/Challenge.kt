package com.fbaierl.iam.model

enum class Difficulty {
    VERY_EASY,
    EASY,
    MEDIUM,
    HARD,
    VERY_HARD
}

enum class Category {
    TRIVIAL,
    ATHLETE,
    EXPLORATION,
    SURVIVALIST,
    MADMAN,
    CRAFTSMAN,
    INTELLECTUAL
}

class Challenge(val id: String,
                val title: String,
                val descriptionText: String,
                val warningText: String,
                val drawable: Int,
                val difficulty: Difficulty,
                val category: Category
) {
}