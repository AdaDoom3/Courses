/*****************************************************************************
 * This file has been automatically generated by                             *
 *    ADA2JAVA (built with ASIS 2.0.R for GNAT GPL 2014 (20140331))          *
 * Original Ada unit: Record_Types                                           *
 * Generation timestamp: 201412211026                                        *
 *****************************************************************************/

package adarecord.Record_Types;

/**
 * @origin record_types.ads:7:9
 */
@SuppressWarnings("all")
public final class A_Record_Type extends com.adacore.ajis.internal.ada.AdaProxy {

   /**
    * @origin record_types.ads:7:9
    * @param this is passed by reference (non escapable)
    * @param Right is passed by reference (non escapable)
    */
   final public boolean equals (java.lang.Object Right) {
      adarecord.Ada2Java.Library.lock.lock ();
      try {
         int [] Id_JNI_120;
         java.lang.Object Id_JNI_121 = this;
         if (this.getClass () != Right.getClass ()) return false;
         if (Id_JNI_121 == null) {
            Id_JNI_120 = com.adacore.ajis.internal.ada.AdaAccess.simpleNullAccess ();
         } else {
            Id_JNI_120 = ((com.adacore.ajis.internal.ada.AdaProxy) Id_JNI_121).getAccess ();
         }
         int [] Id_JNI_124;
         java.lang.Object Id_JNI_125 = ((com.adacore.ajis.internal.ada.AdaProxy) Right);
         if (Id_JNI_125 == null) {
            Id_JNI_124 = com.adacore.ajis.internal.ada.AdaAccess.simpleNullAccess ();
         } else {
            Id_JNI_124 = ((com.adacore.ajis.internal.ada.AdaProxy) Id_JNI_125).getAccess ();
         }
         boolean Id_JNI_129 = equals_Id_JNI_116 (Id_JNI_120, Id_JNI_124);
         return Id_JNI_129;
      } finally {
         adarecord.Ada2Java.Library.lock.unlock ();
      }
   } // equals

   /**
    * @origin record_types.ads:7:9
    * @param this is passed by reference (non escapable)
    * @return is passed by reference (escapable)
    */
   public int [] internalClone () {
      adarecord.Ada2Java.Library.lock.lock ();
      try {
         int [] Id_JNI_137;
         adarecord.Record_Types.A_Record_Type Id_JNI_138 = this;
         if (Id_JNI_138 == null) {
            Id_JNI_137 = com.adacore.ajis.internal.ada.AdaAccess.simpleNullAccess ();
         } else {
            Id_JNI_137 = ((com.adacore.ajis.internal.ada.AdaProxy) Id_JNI_138).getAccess ();
         }
         int [] Id_JNI_146 = ((int []) internalClone_Id_JNI_133 (Id_JNI_137));
         return Id_JNI_146;
      } finally {
         adarecord.Ada2Java.Library.lock.unlock ();
      }
   } // internalClone

   /**
    * @origin record_types.ads:7:9
    * @return is passed by reference (escapable)
    */
   public A_Record_Type () {
      super (new com.adacore.ajis.internal.ada.AdaAccess (null));
      adarecord.Ada2Java.Library.lock.lock ();
      try {
         this.adaAccess = A_Record_Type_Id_JNI_150 ();
         this.myOwner = com.adacore.ajis.IProxy.Owner.PROXY;
         this.myAllocator = com.adacore.ajis.IProxy.Allocator.DYNAMIC;
      } finally {
         adarecord.Ada2Java.Library.lock.unlock ();
      }
   } // A_Record_Type

   public A_Record_Type (com.adacore.ajis.internal.ada.AdaAccess access) {
      this.adaAccess = access.fAcc;
   }

   /**
    * @origin record_types.ads:7:9
    * @param this is passed by reference (non escapable)
    */
   public void deallocateNativeObject () {
      adarecord.Ada2Java.Library.lock.lock ();
      try {
         int [] Id_JNI_165;
         adarecord.Record_Types.A_Record_Type Id_JNI_166 = this;
         if (Id_JNI_166 == null) {
            Id_JNI_165 = com.adacore.ajis.internal.ada.AdaAccess.simpleNullAccess ();
         } else {
            Id_JNI_165 = ((com.adacore.ajis.internal.ada.AdaProxy) Id_JNI_166).getAccess ();
         }
         deallocateNativeObject_Id_JNI_161 (Id_JNI_165);
      } finally {
         adarecord.Ada2Java.Library.lock.unlock ();
      }
   } // deallocateNativeObject

   /**
    * @origin record_types.ads:9:7
    * @param this is passed by reference (non escapable)
    */
   final public int Integer_Field () {
      adarecord.Ada2Java.Library.lock.lock ();
      try {
         int [] Id_JNI_172;
         adarecord.Record_Types.A_Record_Type Id_JNI_173 = this;
         if (Id_JNI_173 == null) {
            Id_JNI_172 = com.adacore.ajis.internal.ada.AdaAccess.simpleNullAccess ();
         } else {
            Id_JNI_172 = ((com.adacore.ajis.internal.ada.AdaProxy) Id_JNI_173).getAccess ();
         }
         int Id_JNI_178 = Integer_Field_Id_JNI_168 (Id_JNI_172);
         return Id_JNI_178;
      } finally {
         adarecord.Ada2Java.Library.lock.unlock ();
      }
   } // Integer_Field

   /**
    * @origin record_types.ads:9:7
    * @param this is passed by reference (non escapable)
    */
   final public void Integer_Field (int Value) {
      adarecord.Ada2Java.Library.lock.lock ();
      try {
         int [] Id_JNI_186;
         adarecord.Record_Types.A_Record_Type Id_JNI_187 = this;
         if (Id_JNI_187 == null) {
            Id_JNI_186 = com.adacore.ajis.internal.ada.AdaAccess.simpleNullAccess ();
         } else {
            Id_JNI_186 = ((com.adacore.ajis.internal.ada.AdaProxy) Id_JNI_187).getAccess ();
         }
         Integer_Field_Id_JNI_182 (Id_JNI_186, Value);
      } finally {
         adarecord.Ada2Java.Library.lock.unlock ();
      }
   } // Integer_Field

   /**
    * @origin record_types.ads:10:7
    * @param this is passed by reference (non escapable)
    */
   final public double Float_Field () {
      adarecord.Ada2Java.Library.lock.lock ();
      try {
         int [] Id_JNI_193;
         adarecord.Record_Types.A_Record_Type Id_JNI_194 = this;
         if (Id_JNI_194 == null) {
            Id_JNI_193 = com.adacore.ajis.internal.ada.AdaAccess.simpleNullAccess ();
         } else {
            Id_JNI_193 = ((com.adacore.ajis.internal.ada.AdaProxy) Id_JNI_194).getAccess ();
         }
         double Id_JNI_199 = Float_Field_Id_JNI_189 (Id_JNI_193);
         return Id_JNI_199;
      } finally {
         adarecord.Ada2Java.Library.lock.unlock ();
      }
   } // Float_Field

   /**
    * @origin record_types.ads:10:7
    * @param this is passed by reference (non escapable)
    */
   final public void Float_Field (double Value) {
      adarecord.Ada2Java.Library.lock.lock ();
      try {
         int [] Id_JNI_207;
         adarecord.Record_Types.A_Record_Type Id_JNI_208 = this;
         if (Id_JNI_208 == null) {
            Id_JNI_207 = com.adacore.ajis.internal.ada.AdaAccess.simpleNullAccess ();
         } else {
            Id_JNI_207 = ((com.adacore.ajis.internal.ada.AdaProxy) Id_JNI_208).getAccess ();
         }
         Float_Field_Id_JNI_203 (Id_JNI_207, Value);
      } finally {
         adarecord.Ada2Java.Library.lock.unlock ();
      }
   } // Float_Field

   /**
    * @origin record_types.ads:12:7
    * @param this is passed by reference (non escapable)
    * @return is passed by reference (static)
    */
   final public adarecord.Record_Types.A_Nested_Record_Type Nested_Record () {
      adarecord.Ada2Java.Library.lock.lock ();
      try {
         int [] Id_JNI_214;
         adarecord.Record_Types.A_Record_Type Id_JNI_215 = this;
         if (Id_JNI_215 == null) {
            Id_JNI_214 = com.adacore.ajis.internal.ada.AdaAccess.simpleNullAccess ();
         } else {
            Id_JNI_214 = ((com.adacore.ajis.internal.ada.AdaProxy) Id_JNI_215).getAccess ();
         }
         int [] Id_JNI_220 = Nested_Record_Id_JNI_210 (Id_JNI_214);
         adarecord.Record_Types.A_Nested_Record_Type Id_JNI_221;
         if (com.adacore.ajis.internal.ada.AdaAccess.isNull (Id_JNI_220)) {
            Id_JNI_221 = null;
         } else {
            Id_JNI_221 = new adarecord.Record_Types.A_Nested_Record_Type (new com.adacore.ajis.internal.ada.AdaAccess (Id_JNI_220));
         }
         adarecord.Record_Types.A_Nested_Record_Type Id_JNI_222 = Id_JNI_221;
         Id_JNI_222.myAllocator = com.adacore.ajis.IProxy.Allocator.STATIC;
         adarecord.Record_Types.A_Nested_Record_Type Id_JNI_223 = Id_JNI_222;
         adarecord.Record_Types.A_Nested_Record_Type Id_JNI_226 = Id_JNI_223;
         Id_JNI_223.container = this;
         return Id_JNI_226;
      } finally {
         adarecord.Ada2Java.Library.lock.unlock ();
      }
   } // Nested_Record

   /**
    * @origin record_types.ads:12:7
    * @param this is passed by reference (non escapable)
    * @param Value is passed by value
    */
   final public void Nested_Record (adarecord.Record_Types.A_Nested_Record_Type Value) {
      adarecord.Ada2Java.Library.lock.lock ();
      try {
         int [] Id_JNI_234;
         adarecord.Record_Types.A_Record_Type Id_JNI_235 = this;
         if (Id_JNI_235 == null) {
            Id_JNI_234 = com.adacore.ajis.internal.ada.AdaAccess.simpleNullAccess ();
         } else {
            Id_JNI_234 = ((com.adacore.ajis.internal.ada.AdaProxy) Id_JNI_235).getAccess ();
         }
         adarecord.Record_Types.A_Nested_Record_Type Id_JNI_236 = Value;
         if (Id_JNI_236 == null) {
            throw new com.adacore.ajis.NativeException ("null not allowed for Value");
         }
         int [] Id_JNI_238;
         adarecord.Record_Types.A_Nested_Record_Type Id_JNI_239 = Id_JNI_236;
         Id_JNI_238 = ((com.adacore.ajis.internal.ada.AdaProxy) Id_JNI_239).getAccess ();
         Nested_Record_Id_JNI_230 (Id_JNI_234, Id_JNI_238);
      } finally {
         adarecord.Ada2Java.Library.lock.unlock ();
      }
   } // Nested_Record

   native private boolean equals_Id_JNI_116 (int [] Left, int [] Right);

   native private int [] internalClone_Id_JNI_133 (int [] This);

   native private int [] A_Record_Type_Id_JNI_150 ();

   native private void deallocateNativeObject_Id_JNI_161 (int [] Obj);

   native private int Integer_Field_Id_JNI_168 (int [] This);

   native private void Integer_Field_Id_JNI_182 (int [] This, int Value);

   native private double Float_Field_Id_JNI_189 (int [] This);

   native private void Float_Field_Id_JNI_203 (int [] This, double Value);

   native private int [] Nested_Record_Id_JNI_210 (int [] This);

   native private void Nested_Record_Id_JNI_230 (int [] This, int [] Value);

   static {
      adarecord.Ada2Java.Library.load ();
   }

} // A_Record_Type