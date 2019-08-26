package be.mickverm.widget.recyclerview.adapter

import androidx.recyclerview.widget.RecyclerView
import io.reactivex.functions.Consumer

abstract class RxBaseSectionedAdapter<T, VH : RecyclerView.ViewHolder, SH : RecyclerView.ViewHolder> :
    BaseSectionedAdapter<T, VH, SH>(), Consumer<List<T>> {

    final override fun accept(items: List<T>) = updateItems(items)
}
