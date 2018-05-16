package glaucoqs.carbcontrol;
import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity

public class Alimento {
    @PrimaryKey(autoGenerate = true)
    @NonNull                                                //Esta tabela está pronta. Falta anotaçoes de chave estrangeira
    public int idalimento;

    public int medida_caseira_idmedida_caseira;

    public int categoria_idcategoria;
    public String nome;
    public double peso_porcao;
    public double carb_porcao;
}
