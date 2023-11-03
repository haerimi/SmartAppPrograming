package skh.mjc.recyclerviewex01_1103

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import skh.mjc.recyclerviewex01_1103.databinding.ItemRecyclerBinding
import java.text.SimpleDateFormat

class customAdapter: RecyclerView.Adapter<Holder>() {
    // ctrl+i를 누르면 사용해야 하는 함수가 적용됨
    // 한 화면에 그려지는 아이템 개수만큼 레이아웃 생성
    var listData = mutableListOf<Memo>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val  binding = ItemRecyclerBinding.inflate(LayoutInflater.from(parent.context),
            parent, false)
        return Holder(binding)
    }

    // 생성된 아이템 레이아웃에 값 입력 후 목록에 출력
    override fun onBindViewHolder(holder: Holder, position: Int) {
        val memo = listData.get(position)
        holder.setMemo(memo)
    }

    // 목록에 보여줄 아이템 개수
    override fun getItemCount(): Int {
        return listData.size
    }
}
class Holder(val binding: ItemRecyclerBinding): RecyclerView.ViewHolder(binding.root) {
    fun setMemo(memo: Memo) {
        binding.textNo.text = "${memo.no}"
        binding.texttitle.text = memo.title
        var sdf = SimpleDateFormat("yyyy/MM//dd")
        var foramttedDate = sdf.format(memo.timestamp)
        binding.textDate.text = foramttedDate
    }
}