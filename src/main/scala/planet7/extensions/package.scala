package planet7

import shapeless.Lazy

package object extensions extends SeqConverterImplicits with RowConverterImplicits {
  object ConvertTo {
    def apply[T](implicit rowConv: Lazy[RowConverter[T]]): RowConverter[T] = rowConv.value
  }
}
