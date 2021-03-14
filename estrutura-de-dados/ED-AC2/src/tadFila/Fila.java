/**
 * 
 */
package tadFila;

/**
 * @author Mathn
 *
 */
public interface Fila {
/* retorna o numer ´ o de itens na fila */
public int tamanho();
/* retorna true se a fila estiver vazia, false sen˜ao */

public boolean vazia();
/* retorna o item a` frente na fila; lan¸ca
QueueEmptyException se a fila estiver vazia */

public Object frente() throws QueueEmptyException;
/* insere elemento no final da fila */

public void insere(Object item);
/* remove e retorna o item a` frente da fila; lan¸ca
QueueEmptyException se a fila estiver vazia */

public Object retira() throws QueueEmptyException;

}