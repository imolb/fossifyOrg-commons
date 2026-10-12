package org.fossify.commons.models.contacts

import android.provider.ContactsContract
import kotlinx.serialization.Serializable

@Serializable
data class RelatedContact(
    var name: String,
    var type: Int = ContactsContract.CommonDataKinds.Relation.TYPE_SPOUSE,
    var label: String = "",
)
