package campus.tech.kakao.map

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SavedSearchAdapter() : RecyclerView.Adapter<SavedSearchAdapter.ViewHolder>() {

    var savedSearchList: List<String> = emptyList()

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val savedWord: TextView = view.findViewById(R.id.savedWord)
        private val deleteSavedWord: Button = view.findViewById(R.id.deleteSavedWord)

        fun bind(savedWord: String) {
            this.savedWord.text = savedWord
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_save_word, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return savedSearchList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(savedSearchList[position])
    }

}