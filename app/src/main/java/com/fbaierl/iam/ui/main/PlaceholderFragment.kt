package com.fbaierl.iam.ui.main

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.fbaierl.iam.R
import com.fbaierl.iam.model.Category
import com.fbaierl.iam.model.Challenge
import com.fbaierl.iam.model.Difficulty

/**
 * A placeholder fragment containing a simple view.
 */
class PlaceholderFragment : Fragment() {

    private lateinit var pageViewModel: PageViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // TODO do we need a view model?
        /*pageViewModel = ViewModelProviders.of(this).get(PageViewModel::class.java).apply {
            setIndex(arguments?.getInt(ARG_SECTION_NUMBER) ?: 1)
        }*/
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_main, container, false) // TODO here we select the root fragment!

        // TODO load current challenge first!
        showCurrentChallenge(root)

        return root
    }

    private fun showCurrentChallenge(root: View) {
        val title = root.findViewById<TextView>(R.id.challengeTitleTextView)
        val image = root.findViewById<ImageView>(R.id.challengeImageView)
        val difficulty = root.findViewById<TextView>(R.id.challengeDifficultyTextView)
        val description = root.findViewById<TextView>(R.id.challengeDescriptionTextView)
        val category = root.findViewById<TextView>(R.id.challengeCategoryTextView)
        val warning = root.findViewById<TextView>(R.id.challengeWarningTextView)

        // TODO get from disc
        val currentChallenge = Challenge(
            id = "1",
            title = "Mointain Expedition I",
            descriptionText = "Climb a mountain that is at least 2000m high. Take a picture at the top.",
            warningText = "WARNING TEXT",
            drawable = R.drawable.mountain_2000,
            difficulty = Difficulty.MEDIUM,
            category = Category.EXPLORATION
        )

        image.setImageResource(R.drawable.mountain_2000)
        title.text = currentChallenge.title
        difficulty.text = currentChallenge.difficulty.toString()
        description.text = currentChallenge.descriptionText
        category.text = currentChallenge.category.toString()
        warning.text = currentChallenge.warningText
    }

    companion object {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        // private const val ARG_SECTION_NUMBER = "section_number"

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        @JvmStatic
        fun newInstance(): PlaceholderFragment {
            return PlaceholderFragment().apply {
                arguments = Bundle().apply {
                    // TODO do we need arguments?
                    // putInt(ARG_SECTION_NUMBER, sectionNumber)
                }
            }
        }
    }
}