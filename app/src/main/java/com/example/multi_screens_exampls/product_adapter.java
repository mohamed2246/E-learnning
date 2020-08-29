package com.example.multi_screens_exampls;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class product_adapter extends RecyclerView.Adapter<product_adapter.model_adapter> {
    ArrayList<model> arrayList = new ArrayList<>();
    oncatclick oncatclick;
    TextView textView;
    TextView textView1;
    ImageView imageView;

    public product_adapter(ArrayList<model> arrayList , oncatclick oncatclick) {

        this.oncatclick = oncatclick;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public model_adapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.object,parent,false);
        model_adapter Productview = new  model_adapter(view);
        return Productview;
    }

    @Override
    public void onBindViewHolder(@NonNull model_adapter holder, final int position) {
            holder.textView.setText(arrayList.get(position).getString());
            holder.textView1.setText(arrayList.get(position).getString2());
            holder.imageView.setImageResource(arrayList.get(position).getAnInt());
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    if (position==0 )
                        oncatclick.onitemclick(position);

                    else if (position==1)
                        oncatclick.onitemclick(position);
                    else if (position==2)
                        oncatclick.onitemclick(position);
                    else if (position==3)
                        oncatclick.onitemclick(position);
                    else if (position==4)
                        oncatclick.onitemclick(position);
                    else if (position==5)
                        oncatclick.onitemclick(position);
                    else if (position==6)
                        oncatclick.onitemclick(position);
                    else if (position==7)
                        oncatclick.onitemclick(position);
                    else if (position==8)
                        oncatclick.onitemclick(position);
                    else if (position==9)
                        oncatclick.onitemclick(position);
                    else if (position==10)
                        oncatclick.onitemclick(position);
                    else if (position==11)
                        oncatclick.onitemclick(position);

                }
            });
    }

    @Override
    public int getItemCount() {
       return arrayList.size();
    }

    public class model_adapter extends RecyclerView.ViewHolder {
        TextView textView;
        TextView textView1;
        ImageView imageView;

        public model_adapter(@NonNull View itemView) {
            super(itemView);

            textView = itemView .findViewById(R.id.one);
            textView1 = itemView .findViewById(R.id.two);
            imageView = itemView.findViewById(R.id.photo);

        }


    }

    public interface oncatclick{

        void onitemclick(int s);
    }

}
