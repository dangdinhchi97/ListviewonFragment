package g.acedemy.listviewonfragment;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Danhsachform extends ListFragment {
    String []arraylist={"Dang Dinh Chi","Tran van hoa", "Vo van hien", "Le thanh ton","Dao duc gia"};
    ArrayAdapter adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        adapter=new ArrayAdapter(getActivity(),android.R.layout.simple_expandable_list_item_1,arraylist);
        setListAdapter(adapter);
        return inflater.inflate(R.layout.danhsach_form,container,false);

    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        Toast.makeText(getActivity(), arraylist[position], Toast.LENGTH_SHORT).show();
        super.onListItemClick(l, v, position, id);
    }
}
