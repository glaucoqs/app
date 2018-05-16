package glaucoqs.carbcontrol;
import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity

public class Categoria {
    @PrimaryKey(autoGenerate = true)
    public int idcategoria;
    public String nome;                                 //Esta tabela está pronta. Falta anotaçoes de chave estrangeira


}
